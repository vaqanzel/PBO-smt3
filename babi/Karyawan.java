class Karyawan {
    String nama;
    String skill;

    public Karyawan(String nama, String skill) {
        this.nama = nama;
        this.skill = skill;
    }

    public void bekerja() {
        System.out.println(nama + " sedang bekerja sebagai " + skill);
    }
}
