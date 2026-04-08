Pertanyaan Praktikum 6.2
1. tampilPosisi berfungsi untuk menampilkan posisi/indeks data dalam array, sedangkan tampilDataSearch berfungsi untuk menampilkan detail lengkap data mahasiswa
2. loop berjalan dari indeks 0 sampai akhir. Begitu ketemu IPK yang dicari, simpan posisinya di posisi = j, lalu langsung berhenti (break)
3. untuk menyimpan letak data yang ditemukan dalam proses pencarian
4. akan menampilkan data yang pertama kali ditemukan. Program melakukan pencarian dari indeks awal (0) ke akhir. Saat menemukan data yang sama dengan nilai yang dicari posisi langsung disimpan perulangan dihentikan dengan break. Akibatnya, data yang ditampilkan adalah kemunculan pertama saja
5. maka proses perulangan akan tetap berjalan sampai seluruh data selesai diperiksa, meskipun data yang dicari sudah ditemukan

Pertanyaan Praktikum 6.3
1. int mid = (left + right) / 2;
2. if (cari == listMhs[mid].ipk) {
    return mid;
   }
3. left berfungsi sebagai batas kiri (awal) dari area pencarian, right berfungsi sebagai batas kanan (akhir) dari area pencarian, mid adalah indeks tengah dari area pencarian
4. program tetap dapat berjalan, tetapi hasil pencarian menggunakan binary search tidak akan akurat (bisa salah atau tidak ditemukan)
5. hasilnya tidak sesuai, karena
   else if (listMhs[mid].ipk > cari) {
    return findBinarySearch(cari, left, mid-1);
    } else {
    return findBinarySearch(cari, mid+1, right);
    }
   hanya untuk data yang urutannya dari kecil ke besar. (modifikasi ada pada kode program)
6. ketika batas pencarian sudah habis (left > right), sehingga tidak ada lagi elemen yang dapat diperiksa dalam array
7. modifikasi
