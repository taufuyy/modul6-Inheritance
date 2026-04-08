# Materi Inheritance (Pewarisan) - Java

Pada project ini, konsep **inheritance** dipakai agar class turunan bisa mewarisi atribut dan method dari class induk.

---

## 1) Inheritance

Inheritance adalah hubungan **is-a** antara class anak dengan class induk.

Contoh pada project:
- `Pria` mewarisi `Manusia` → `public class Pria extends Manusia`
- `Kucing` mewarisi `Hewan` → `public class Kucing extends Hewan`
- `Ikan` mewarisi `Hewan` → `public class Ikan extends Hewan`

Manfaat utama:
- Mengurangi duplikasi kode
- Membuat kode lebih rapi dan mudah dikembangkan
- Mendukung polymorphism

---

## 2) Keyword `super`

Keyword `super` digunakan untuk mengakses anggota milik superclass (class induk), terutama constructor.

### a. `super` pada constructor `Pria`
Di class `Pria`, constructor memanggil constructor `Manusia`:

`super(nama);`

Artinya, nilai `nama` diinisialisasi oleh constructor class induk (`Manusia`) terlebih dahulu.

### b. `super` pada constructor `Kucing` dan `Ikan`
- `Kucing` memanggil `super("Kucing", 1);`
- `Ikan` memanggil `super("Arwana", 1);`

Karena `Kucing` dan `Ikan` adalah turunan `Hewan`, maka atribut `nama` dan `ekor` di class `Hewan` bisa langsung diisi dari constructor subclass melalui `super(...)`.

---

## 3) Overriding

**Overriding** adalah ketika subclass menulis ulang method dari superclass dengan **signature yang sama**.

Contoh pada project:

### a. `Kucing` override `makan()`
Di `Hewan` ada method:
- `public void makan()`

Lalu di `Kucing`, method ini dioverride:
- `public void makan()` → output: `Kucing Makan Ikan`

### b. `Ikan` override `makan(String pakan)`
Di `Hewan` ada method:
- `public void makan(String makanan)`

Di `Ikan`, method serupa dioverride:
- `public void makan(String pakan)` → output khusus untuk ikan.

Catatan:
- Nama parameter boleh berbeda (`makanan` vs `pakan`), yang penting tipe dan urutan parameter sama.
- Anotasi `@Override` membantu memastikan method benar-benar override method milik superclass.

---

## 4) Overloading

**Overloading** adalah penggunaan nama method yang sama dalam satu class, tapi jumlah/tipe parameter berbeda.

Contoh pada class `Hewan`:
- `makan()`
- `makan(String makanan)`

Kedua method tersebut punya nama sama (`makan`) tapi parameter berbeda, sehingga Java menganggapnya sebagai method yang berbeda.

---

## 5) Alur pada `Main`

Di `Main` dibuat objek:
- `Kucing kucing = new Kucing();`
- `Ikan ikan = new Ikan();`

Pemanggilan method:
- `kucing.makan();` → memakai versi override milik `Kucing`
- `kucing.makan("ikan");` → memakai method overload dari `Hewan` (karena `Kucing` tidak override versi ini)
- `ikan.makan("Cacing");` → memakai versi override milik `Ikan`
- `ikan.makan();` → memakai method `makan()` dari `Hewan` (karena `Ikan` tidak override versi tanpa parameter)

Ini menunjukkan bagaimana inheritance, overriding, dan overloading bekerja bersama dalam satu program.

---

## Kesimpulan

Project ini sudah menggambarkan 3 konsep OOP penting:
1. **`super`** untuk memanggil constructor superclass.
2. **Overriding** untuk mengubah perilaku method turunan.
3. **Overloading** untuk membuat variasi method dengan nama sama tapi parameter berbeda.

Dengan tiga konsep ini, kode menjadi lebih fleksibel, reusable, dan mudah dikembangkan.
