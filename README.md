# FP-OOP2022
## Final Project OOP 2022

### Nama    : Made Nanda Wija Vahindra  
### NRP     : 5025211160  

Rencana project yang ingin saya buat adalah pembelian tiket bioskop. User diminta untuk mengisikan identitas diri kemudian memilih tipe teater yang ingin dipesan. User juga menginput hari, jumlah tiket yang ingin dibeli. Kemudian diberikan beberapa judul film dengan harga yang bervariasi bergantung pada tipe teater dan hari yang ingin dipesan. lalu user memilih waktu yang telah disediakan. kemudian proses untuk total pembayaran. cetak struk pembayaran, total, dan kode untuk pembayaran

## Aspek OOP yang diimplementasikan

### 1. Casting/conversion
Nama file : dashboardController.java  
Source Code :  
detmov_ticketprice.setText("Rp " + Integer.toString(ti.getTicketPrice()));  
salah satu casting yang dilakukan yaitu dari tipe Integer diubah ke tipe String  
### 2. Constructor  
Nama file : Ticket.java  
Source Code :  
public void Ticket(String genre, String cinema)  
    {  
        ...  
    }  
Constructor untuk class ticket  
### 3. Polymorphism
Nama file : Action.java  
Source Code :  
public class action extends Genre{  
 ...  
}  
salah satu polymorphism dari class genre

### 4. Overriding  
Nama file : Action.java  
Source Code :
@Override  
    public String printGenre()  
    {  
        return "Action";  
    }  
salah satu implementasi overriding  
### 5. Encapsulation  
Nama file : getData.java
Source Code :  
public class getData {  
    private static String movieName;  
    private static String username; 
    private static LocalDate date;  
    private static int quantity;  
Salah satu contoh encapsulation pada program dan hanya bisa diakses dengan method set dan get  
### 6. Inheritance  
Nama file : Genre.java  
Source Code :  
public class Genre extends abstractGenre
{
    ...  
}
Inheritance class genre
### 7. Abstract  
Nama file : abstractGenre.java  
Source Code :  
abstract public class abstractGenre {  
    abstract public int getTicketPrice();  
    abstract public void setTicketPrice(int ticketPrice);  
    abstract public String printGenre();  
}  
abstract class untuk class genre

### 8. Interface
Nama file : interfaceTicket.java  
Source Code :  
interface InterfaceTicket {  
    public void Ticket(String genre, String cinema);  
    public void ResetPrice();  
}  
interface untuk class ticket

### 9. Collection  
Nama file : dashboardController.java  
Source Code :  
HashMap<String,String> movieGenre = new HashMap();  
HashMap<String,Image> movieImage = new HashMap();  
Collection map yang berisi tipe string dan image  

### 10.Input Output  
Nama file : FXMLDocumentController.java
Source Code :  
public void readFile()  
    {  
        ...  
    }  
Digunakan pada beberapa method pada file FXMLDocumentController.java untuk fitur sign in dan sign up pada halaman awal yang akan disimpan ke dalam file yang ada di dalam folder \\Logins\\Account.txt  

### 11. Exception Handling  
Nama file : FXMLDocumentController.java  
Source Code :  
try {  
            RandomAccessFile raf = new RandomAccessFile(f+"\\Accounts.txt", ...  
        } catch (FileNotFoundException ex) {  
            Logger.getLogger(FXMLDocumentController.class.getName()).log  (Level.SEVERE, null, ex);  
        } catch (IOException ex) {  
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);  
        }  
}  
Exception Handling banyak digunakan untuk input output menggunakan RandomAccessFile  
### 12. GUI  
Nama file : FXMLDocument.fxml dan dashboard.fxml  
membuat user interface menggunakan sceneBuilder dan library tambahan yaitu fontawesomefx-8.2.jar
