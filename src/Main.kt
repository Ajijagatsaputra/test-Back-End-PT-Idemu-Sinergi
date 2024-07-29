import java.util.Scanner

fun hitungGaji(jamKerja: Double, tarifPerJam: Double): Double {
    val jamNormal = 40.0
    val tarifLembur = 1.5

    return if (jamKerja <= jamNormal) {
        jamKerja * tarifPerJam
    } else {
        (jamNormal * tarifPerJam) + ((jamKerja - jamNormal) * tarifPerJam * tarifLembur)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan jumlah jam kerja: ")
    val jamKerja = scanner.nextDouble()

    print("Masukkan tarif per jam: ")
    val tarifPerJam = scanner.nextDouble()

    val gaji = hitungGaji(jamKerja, tarifPerJam)

    println("Gaji karyawan: Rp%.2f".format(gaji))
}
