## Skenario Pengujian
### HomeActivityTest.kt
1. Menampilkan tablayout dan viewpager berisi 2 Tab untuk movies dan tv show
    * Memastikan viewpager tampil
    * Memastikan tab Movies dan tab Tv Show tampil
    * Memastikan tab Movies dipilih
    * Usap viewpager ke kanan dan memastikan tab tv show dipilih
    * Usap viewpager ke kiri dan memastikan tab movies dipilih
2. Memastikan recycler view menampilkan daftar movies dan tv show
    * Memastikan recycler view movies tampil
    * Gulir recyclerview ke movie terakhir
    * Usap viewpager ke kiri untuk membuka tab tv show
    * Memastikan recycler view tvshow tampil
    * Gulirrecyclerview ke tvshow terakhir
3. Membuka detail movie dan catalog
    * Memastikan recycler view movies tampil
    * Mengklik item pertama pada recycler view movies
    * Memastikan judul movie yang tampil sama dengan item pertama pada data movie
    * Pencet tombol Back
    * Memastikan viewpager tampil dan usap ke kiri
    * Memastikan recycler view tvshow tampil
    * Mengklik item pertama pada recycler view tvshow
    * Memastikan judul tvshow yang tampil sama dengan item pertama pada data tvshow
