package dev.qori.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.data.TvShowData
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun swipeTabs(){
        onView(withId(R.id.viewPager)).check(matches(isDisplayed()))
        onView(withText("MOVIES")).check(matches(isDisplayed()))
        onView(withText("TV SHOW")).check(matches(isDisplayed()))

        onView(withText("MOVIES")).check(matches(isSelected()))

        onView(withId(R.id.viewPager)).perform(swipeLeft())
        onView(withText("TV SHOW")).check(matches(isSelected()))

        onView(withId(R.id.viewPager)).perform(swipeRight())
        onView(withText("MOVIES")).check(matches(isSelected()))
    }

    @Test
    fun scrollRecyclerView(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            MovieData.list.size))

        onView(withId(R.id.viewPager)).perform(swipeLeft())

        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            TvShowData.list.size))
    }

    @Test
    fun openDetail(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.tvMovieTitle)).check(matches(withText(MovieData.list[0].title)))

        Espresso.pressBack()
        onView(withId(R.id.viewPager)).check(matches(isDisplayed()))
        onView(withId(R.id.viewPager)).perform(swipeLeft())

        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTvShowTitle)).check(matches(withText(TvShowData.list[0].title)))
    }

}