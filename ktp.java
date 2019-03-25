//Kartu tand penduduk
//NIK : int
//Nama : string
//Alamat : string
//TTL : string
//rt-rw : string
//Pekerjaan : string
//desa : string
//kecamatan : string
//agama : string
//status perkawinan: string
//kewarganegaraan : string
//berlaku hingga: string

public class ktp {
	private int noKartu, noKK, noIndukKeluarga;
	private String , alamatAnggota, tempatTanggalLahir, pekerjaan;	
	public kartuSehat (int noKartu,int noKK, int noIndukKeluarga, String namaAnggota, String alamatAnggota, String tempatTanggalLahir, String pekerjaan,){
		this.noKartu = noKartu;
		this.noKK = noKK;
		this.noIndukKeluarga = noIndukKeluarga;
		this.alamatAnggota = alamatAnggota;
		this.tempatTanggalLahir = tempatTanggalLahir;
		this.pekerjaan = pekerjaan;
	}
		public int NoKartu(){
			return noKartu;
		}
		public int NoKK(){
			return noKK;
		}
		public int NoIndukKeluarga(){
			return noIndukKeluarga;
		}
		public String NamaAnggota(){
			return namaAnggota;
		}
		public String AlamatAnggota(){
			return alamatAnggota;
		}
		public String TempatTanggalLahir(){
			return tempatTanggalLahir;
		}
		public String Pekerjaan(){
			return pekerjaan;
		}
		public String LokasiAskes(){
			return lokasiAskes;
		}
		
}