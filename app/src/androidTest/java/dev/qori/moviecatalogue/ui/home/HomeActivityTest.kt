package dev.qori.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.data.TvShowData
import org.hamcrest.Matchers.`is`
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun swipeTabs(){
        onView(withId(R.id.vpHome)).check(matches(isDisplayed()))
        onView(withText("MOVIES")).check(matches(isDisplayed()))
        onView(withText("TV SHOW")).check(matches(isDisplayed()))

        onView(withText("MOVIES")).check(matches(isSelected()))

        onView(withId(R.id.vpHome)).perform(swipeLeft())
        onView(withText("TV SHOW")).check(matches(isSelected()))

        onView(withId(R.id.vpHome)).perform(swipeRight())
        onView(withText("MOVIES")).check(matches(isSelected()))
    }

    @Test
    fun scrollRecyclerView(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            MovieData.list.size))

        onView(withId(R.id.vpHome)).perform(swipeLeft())

        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            TvShowData.list.size))
    }

    @Test
    fun openMovieDetail(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        val movie = MovieData.list[0]

        onView(withId(R.id.tvMovieTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieTitle)).check(matches(withText(movie.title)))

        onView(withId(R.id.tvMovieDescription)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieDescription)).check(matches(withText(movie.description)))

        onView(withId(R.id.tvMovieAgeRating)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieAgeRating)).check(matches(withText(movie.ageRating.text)))

        onView(withId(R.id.tvMovieReleaseYear)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieReleaseYear)).check(matches(withText(movie.releaseYear.toString())))

        onView(withId(R.id.tvMovieGenres)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieGenres)).check(matches(withText(movie.genres.joinToString(", "))))

        onView(withId(R.id.tvMovieScore)).check(matches(isDisplayed()))
        onView(withId(R.id.tvMovieScore)).check(matches(withText("${movie.score}%")))

        onView(withId(R.id.ivMoviePosterDetail)).check(matches(
            withTagKey(R.id.ivMoviePosterDetail, `is`( movie.poster))
            )
        )
    }

    @Test
    fun openTvShowDetail(){
        onView(withId(R.id.vpHome)).check(matches(isDisplayed()))
        onView(withId(R.id.vpHome)).perform(swipeLeft())

        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        val tvShow = TvShowData.list[0]

        onView(withId(R.id.tvTvShowTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowTitle)).check(matches(withText(tvShow.title)))

        onView(withId(R.id.tvTvShowDescription)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowDescription)).check(matches(withText(tvShow.description)))

        onView(withId(R.id.tvTvShowAgeRating)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowAgeRating)).check(matches(withText(tvShow.ageRating.text)))

        onView(withId(R.id.tvTvShowAiringYear)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowAiringYear)).check(
            matches(withText("${tvShow.firstSeasonYear}-${tvShow.lastSeasonYear}"))
        )

        onView(withId(R.id.tvTvShowGenres)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowGenres)).check(
            matches(withText(tvShow.genres.joinToString(", ")))
        )

        onView(withId(R.id.tvTvShowScore)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTvShowScore)).check(matches(withText("${tvShow.score}%")))

        onView(withId(R.id.ivTvShowPosterDetail)).check(matches(
                withTagKey(R.id.ivTvShowPosterDetail, `is`( tvShow.poster))
            )
        )
    }

}