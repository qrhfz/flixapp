## Skenario Intrumentation Testing
### HomeActivityTest.kt
1. Menampilkan halaman home
    1. Memastikan **ViewPager2 vpHome** tampil
    2. Memastikan **TabLayout tlHome** memiliki tab "MOVIES" dan "TV SHOW"
    3. Memastikan tab Movies pada **tlHome** terpilih
    4. Usap **vpHome** ke kanan
    5. Memastikan tab tv show dipilih pada **tlHome**
    6. Usap **vpHome** ke kiri 
    7. Memastikan tab movie dipilih pada **tlHome**
2. Memastikan daftar movies dan tv show dapat tampil
    * Memastikan **RecylcerView rvMovie** tampil
    * Gulir **rvMovie** ke movie terakhir
    * Usap **vpHome** ke kiri
    * Memastikan **RecylcerView rvTvShow** tampil
    * Gulir **rvTvShow** ke item terakhir
3. Membuka detail movie
    * Memastikan **rvMovie** tampil
    * Mengklik item pertama pada **rvMovie**
    * Memastikan **TextView tvMovieTitle** tampil
    * Memastikan **tvMovieTitle** memiliki isi teks yang sesuai
    * Memastikan **TextView tvMovieDescription** tampil
    * Memastikan **tvMovieDescription** memiliki isi teks yang sesuai
    * Memastikan **TextView tvMovieAgeRating** tampil
    * Memastikan **tvMovieAgeRating** memiliki isi teks yang sesuai
    * Memastikan **TextView tvMovieReleaseYear** tampil
    * Memastikan **tvMovieReleaseYear** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowGenres** tampil
    * Memastikan **tvTvShowGenres** memiliki isi teks yang sesuai
    * Memastikan **TextView tvMovieScore** tampil
    * Memastikan **tvMovieScore** memiliki isi teks yang sesuai
    * Memastikan **ImageView ivMoviePosterDetail** memiliki tag dengan value url poster
4. Membuka detail tv show
    * Memastikan **vpHome** tampil
    * Mengusap **vpHome** ke kanan
    * Mengklik item pertama pada **rvTvShow**
    * Memastikan **TextView tvTvShowTitle** tampil
    * Memastikan **tvTvShowTitle** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowDescription** tampil
    * Memastikan **tvTvShowDescription** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowAgeRating** tampil
    * Memastikan **tvTvShowAgeRating** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowAiringYear** tampil
    * Memastikan **tvTvShowAiringYear** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowGenres** tampil
    * Memastikan **tvTvShowGenres** memiliki isi teks yang sesuai
    * Memastikan **TextView tvTvShowScore** tampil
    * Memastikan **tvTvShowScore** memiliki isi teks yang sesuai
    * Memastikan **ImageView ivTvShowPosterDetail** memiliki tag dengan value url poster

