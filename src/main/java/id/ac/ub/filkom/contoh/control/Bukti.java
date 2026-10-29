package id.ac.ub.filkom.contoh.control;

import id.ac.ub.filkom.contoh.entity.TransaksiPinjam;
import java.time.LocalDate;

public class Bukti {
    private String idTransaksi;
    private String namaAnggota;
    private String judulBuku;
    private LocalDate tanggalPinjam;
    private String status;

    public static Bukti dari(TransaksiPinjam t) {
        Bukti b = new Bukti();
        b.idTransaksi = t.getIdTransaksi();
        b.namaAnggota = t.getAnggota().getNama();
        b.judulBuku = t.getBuku().getJudul();
        b.tanggalPinjam = t.getTanggalPinjam();
        b.status = t.getStatus();
        return b;
    }

    public String getIdTransaksi() { return idTransaksi; }
    public String getNamaAnggota() { return namaAnggota; }
    public String getJudulBuku() { return judulBuku; }
    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public String getStatus() { return status; }
}
