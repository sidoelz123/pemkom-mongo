/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.UpdateResult;
import java.util.Date;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author ijaa76
 */
public class test {
    public static void main(String[] args) {
        try{
            // koneksi ke database
            MongoDatabase database = connect.sambungDB();
            
            // melihat daftar koleksi
            System.out.println("================");
            System.out.println("Daftar Tabel dalam Database");
            MongoIterable<String> tables = database.listCollectionNames();
            for (String name: tables){
                System.out.println(name);
            }
            
            // menambahkan data
            System.out.println("================");
            System.out.println("Menambah Data");
            MongoCollection<Document> col = database.getCollection("produk");
            Document doc = new Document();
            doc.put("nama", "Printer Inkjet");
            doc.put("harga", 1204000);
            doc.put("tanggal", new Date());
            col.insertOne(doc);
            System.out.println("Data telah disimpan");
            
            // get _id
            Object id = new ObjectId(doc.get("_id").toString());
            
            // menampilkan data
            System.out.println("====================");
            System.out.println("Data dalam koleksi produk");
            MongoCursor<Document> cursor = col.find().iterator();
            while (cursor.hasNext()){
                System.out.println(cursor.next().toJson());
            }
            
            // mencari dokumen berdasarkan id
            Document myDoc = col.find(eq("_id",id)).first();
            System.out.println("==================");
            System.out.println("Pencarian data berdasarkan id: "+id);
            System.out.println(myDoc.toJson());
            
            // edit data
            Document docs = new Document();
            docs.put("nama", "Canon");
            Document doc_edit = new Document("$set", docs);
            UpdateResult hasil_edit = col.updateOne(eq("_id", id), doc_edit);
            System.out.println(hasil_edit.getModifiedCount());
            
             System.out.println("=========================");
            System.out.println("Data dalam koleksi produk");
            cursor = col.find().iterator();
            while (cursor.hasNext()){
                System.out.println(cursor.next().toJson());
            }
            
            //menghapus data
            col.deleteOne(eq("_id", id));
            //melihat atau menampilkan data
            System.out.println("========================");
            System.out.println("Data dalam koleksi produk");
            cursor = col.find().iterator();
            while (cursor.hasNext()){
                System.out.println(cursor.next().toJson());
            }
         } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
