package dev.qori.moviecatalogue.data

import dev.qori.moviecatalogue.entities.Movie
import dev.qori.moviecatalogue.entities.MovieAgeRating
import dev.qori.moviecatalogue.entities.TvShow

object MovieData {
    val list: List<Movie> = listOf(
        Movie(
            332562,
        "A Star Is Born",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_a_start_is_born.jpg",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            2018,
        75,
        ageRating = MovieAgeRating.R,
        genres = listOf("Drama", "Romance"),
        ),
        Movie(
            399579,
            "Alita: Battle Angel ",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_alita.jpg",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            2019,
            72,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Action", "Science Fiction", "Adventure"),
        ),
        Movie(
            297802,
            "Aquaman",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_aquaman.jpg",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            2018,
            69,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Action", "Adventure", "Fantasy"),
        ),
        Movie(
            424694,
            "Bohemian Rhapsody",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_bohemian.jpg",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            2018,
            80,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Music", "Drama", "History"),
        ),
        Movie(
            438650,
            "Cold Pursuit",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_cold_persuit.jpg",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            2019,
            57,
            ageRating = MovieAgeRating.R,
            genres = listOf("Action", "Crime", "Thriller"),
        ),
        Movie(
            312221,
            "Creed",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_creed.jpg",
            "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.",
            2015,
            74,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Drama"),
        ),
        Movie(
            338952,
            "Fantastic Beasts: The Crimes of Grindelwald",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_crimes.jpg",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            2018,
            69,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Adventure","Fantasy","Drama"),
        ),
        Movie(
            450465,
            "Glass",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_glass.jpg",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            2019,
            67,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Thriller","Drama", "Science Fiction"),
        ),
        Movie(
            166428,
            "How to Train Your Dragon: The Hidden World",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_how_to_train.jpg",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            2019,
            78,
            ageRating = MovieAgeRating.G,
            genres = listOf("Animation","Family", "Adventure"),
        ),
        Movie(
            299536,
            "Avengers: Infinity War",
            "https://github.com/qrhfz/flixapp/raw/main/assets/movies/poster_infinity_war.jpg",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            2018,
            83,
            ageRating = MovieAgeRating.PG_13,
            genres = listOf("Adventure","Action", "Science Fiction"),
        ),
    )

    fun getItemCount() = list.size

    fun getWhereId(id: Int): Movie? = this.list.firstOrNull {
        it.id == id
    }
}