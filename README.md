# LatUKL-soal-nomer-1-bagian-1
⚙️ Cara Kerja Program

Pengguna diminta memasukkan:

Jarak paket (km)

Berat paket (kg)

Panjang, lebar, dan tinggi paket (cm)

Program menghitung biaya pengiriman berdasarkan dua faktor utama:

Biaya berat:

Jika jarak lebih dari 10 km → biaya = 6000 * berat

Jika jarak ≤ 10 km → biaya = 4000 * berat

Biaya volume:

Jika volume (panjang × lebar × tinggi) lebih dari 100 cm³ → biaya tambahan = 50000 + berat paket

Jika tidak, biaya tambahan = 0

Total biaya dihitung dengan rumus:

Total = Biaya Berat + Biaya Volume


Program menampilkan hasil akhir berupa rincian:

Biaya berdasarkan berat

Biaya tambahan berdasarkan volume

Total keseluruhan biaya pengiriman

🧩 Contoh Output
Masukkan Jarak Paket:
8
Masukkan Berat Paket (kg):
2
Masukkan Panjang Paket (cm):
20
Masukkan Lebar Paket (cm):
10
Masukkan Tinggi Paket (cm):
5

---------Rincian Biaya---------
Biaya Berat Paket: 8000.0
Biaya Volume Paket: 0.0
Total Biaya Pengiriman: 8000.0

👨‍💻 Teknologi yang Digunakan

Bahasa: Java

Library: java.util.Scanner

🏫 Keterangan

Program ini dibuat sebagai latihan dasar logika pemrograman Java untuk menghitung biaya pengiriman berdasarkan beberapa kondisi.
