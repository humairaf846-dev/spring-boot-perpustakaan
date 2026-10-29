package id.ac.ub.filkom.contoh.control;

public class PinjamGagalException extends RuntimeException {
    private final boolean bisaReservasi;

    public PinjamGagalException(String message, boolean bisaReservasi) {
        super(message);
        this.bisaReservasi = bisaReservasi;
    }

    public static PinjamGagalException stokHabis() {
        return new PinjamGagalException("Stok buku habis", true);
    }

    public static PinjamGagalException melewatiBatas() {
        return new PinjamGagalException("Melewati batas pinjam", false);
    }

    public static PinjamGagalException tidakDitemukan(String entitas) {
        return new PinjamGagalException(entitas + " tidak ditemukan", false);
    }

    public boolean isBisaReservasi() { return bisaReservasi; }
}
