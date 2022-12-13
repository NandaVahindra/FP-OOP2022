# FP-OOP2022
## Final Project OOP 2022

### Nama    : Made Nanda Wija Vahindra  
### NRP     : 5025211160  

![image](https://user-images.githubusercontent.com/114988957/207270584-724c23b1-407f-40ac-9e33-4872246e401d.png)


Rencana project yang ingin saya buat adalah pembelian tiket bioskop. User diminta untuk mengisikan identitas diri kemudian memilih tipe teater yang ingin dipesan. User juga menginput hari, jumlah tiket yang ingin dibeli. Kemudian diberikan beberapa judul film dengan harga yang bervariasi bergantung pada tipe teater dan hari yang ingin dipesan. lalu user memilih waktu yang telah disediakan. kemudian proses untuk total pembayaran. cetak struk pembayaran, total, dan kode untuk pembayaran  
Referensi   : https://www.youtube.com/watch?v=-Y6PwX6IQwQ&t=1214s  
Demo Aplikasi : https://youtu.be/nYeEtwfgVYE
## Aspek OOP yang diimplementasikan

### 1. Casting/conversion
Nama file : dashboardController.java  
Source Code :  

https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/dashboardController.java#L309

salah satu casting yang dilakukan yaitu dari tipe Integer diubah ke tipe String  
### 2. Constructor  
Nama file : Ticket.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/Ticket.java#L15-L37
Constructor untuk class ticket  

### 3. Polymorphism
Nama file : Action.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/action.java#L11-L18
salah satu polymorphism dari class genre

### 4. Overriding  
Nama file : Action.java  
Source Code :
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/action.java#L20-L25
salah satu implementasi overriding  

### 5. Encapsulation  
Nama file : getData.java
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/getData.java#L14-L82
Salah satu contoh encapsulation pada program dan hanya bisa diakses dengan method set dan get  

### 6. Inheritance  
Nama file : Genre.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/Genre.java#L11-L35
Inheritance class genre  

### 7. Abstract  
Nama file : abstractGenre.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/abstractGenre.java#L11-L15
abstract class untuk class genre

### 8. Interface
Nama file : interfaceTicket.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/InterfaceTicket.java#L11-L14
interface untuk class ticket

### 9. Collection  
Nama file : dashboardController.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/dashboardController.java#L186-L187
Collection map yang berisi tipe string dan image  

### 10.Input Output  
Nama file : FXMLDocumentController.java
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/FXMLDocumentController.java#L39
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/FXMLDocumentController.java#L95-L108
Digunakan pada beberapa method pada file FXMLDocumentController.java untuk fitur sign in dan sign up pada halaman awal yang akan disimpan ke dalam file yang ada di dalam folder \\Logins\\Account.txt  

### 11. Exception Handling  
Nama file : FXMLDocumentController.java  
Source Code :  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/FXMLDocumentController.java#L97-L107
Exception Handling banyak digunakan untuk input output menggunakan RandomAccessFile  

### 12. GUI  
Nama file : FXMLDocument.fxml dan dashboard.fxml  
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/dashboard.fxml#L1-L501
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/FXMLDocument.fxml#L1-L54
![image](https://user-images.githubusercontent.com/114988957/207283972-b35bb32d-ba93-4e9f-bd8c-82cc3e4cf91b.png)
![image](https://user-images.githubusercontent.com/114988957/207284079-8b781b0f-d4c4-41da-8f6c-90b307e6bcde.png)

membuat user interface menggunakan sceneBuilder dan library tambahan yaitu fontawesomefx-8.2.jar

### 13. ArrayList
Nama file : dashboardController.java
https://github.com/NandaVahindra/FP-OOP2022/blob/168b0cbfc9bb2ff5eba5185b9184a3a4bc3015ca/MovieTheatreSystem/src/movietheatresystem/dashboardController.java#L444
Memakai Observable Array List untuk Set item pada combo box dengan Array yang telah dibuat
