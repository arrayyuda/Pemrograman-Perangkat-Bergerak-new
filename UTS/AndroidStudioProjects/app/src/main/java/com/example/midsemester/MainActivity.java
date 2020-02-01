package com.example.midsemester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Yovie Widianto");
        model.setDescription("Yovie Widianto (lahir di Bandung, Jawa Barat, 21 Januari 1968; umur 51 tahun) adalah pianis dan musikus berkebangsaan Indonesia. Dia dikenal sebagai salah satu personel dan pendiri grup musik Kahitna di posisi keyboard/piano dan beberapa group musik yang dibuatnya seperti Yovie and Nuno dan 5 romeo yang aransemen musiknya memiliki ciri khas tersendiri. Selain itu, Yovie termasuk pencipta lagu produktif di belantika musik Indonesia.");
        model.setImg(R.drawable.yovie);
        models.add(model);

        model = new Model();
        model.setTitle("Dudy Oris");
        model.setDescription("Dudy Eko Handoko Kurniawan atau Dudy Oris (lahir di Surabaya, 16 Oktober 1976; umur 43 tahun) adalah eks vokalis grup Yovie & Nuno, Ia bergabung dengan Yovie & Nuno sejak awal berdirinya grup tersebut pada tahun 2001. Dudy juga pernah bekerja sama dengan Krishna Balagita (eks Ada Band), untuk membuat album Krisna New Spectrum dalam lagu Buatku Menangis. Pada tanggal 2 April 2012, Dudy Oris keluar dari Yovie and Nuno. ");
        model.setImg(R.drawable.dudy);
        models.add(model);

        model = new Model();
        model.setTitle("Dikta Wicaksono");
        model.setDescription("Pradikta Wicaksono (lahir di Jakarta, 10 Januari 1986; umur 33 tahun) atau sering dipanggil Dikta, adalah vokalis dan gitaris grup Dikta Project serta vokalis Yovie & Nuno, bersama dengan Arya Windura. Ia bergabung dengan Yovie & Nuno pada tahun 2007, yaitu pada saat terjadi perubahan formasi yang dalam grup tersebut. Ia pertama kali memulai debut aktingnya dalam Drama musikal Stereo (serial televisi) yang ditayangkan di stasiun televisi NET.");
        model.setImg(R.drawable.dikta);
        models.add(model);

        model = new Model();
        model.setTitle("Gail Satyawaki");
        model.setDescription("Gail Satyawaki (lahir di Bandung, Jawa Barat, 22 November 1979; umur 39 tahun) adalah penyanyi asal Indonesia. Penyanyi yang sering disapa Gail ini memulai kariernya sejak mengikuti kompetisi Asia Bagus pada tahun 2000. Kemudian dirinya bergabung dengan band Yovie & Nuno pada tahun 2003 sampai keluar pada tahun 2006. Saat ini dirinya menjadi penyanyi solo. Pada tahun 2015, Gail kembali dengan mengikuti kompetisi X Factor Indonesia. ");
        model.setImg(R.drawable.gail);
        models.add(model);

        model = new Model();
        model.setTitle("Muchammad Ahadiyat");
        model.setDescription("Muchamad Ahadiyat (lahir di Bandung, Jawa Barat, 1 September 1974; umur 45 tahun; sering dipanggil Diat)[1] adalah gitaris Yovie & Nuno.");
        model.setImg(R.drawable.diat);
        models.add(model);

        model = new Model();
        model.setTitle("Rere Reza");
        model.setDescription("Mochamed Reza atau disapa dengan Rere Reza (lahir di Sukabumi, Jawa Barat, 18 Agustus 1968; umur 51 tahun) adalah seorang drummer asal Indonesia yang terkenal telah membantu beberapa band Indonesia. Kini, Rere yang berdarah Jawa-Sunda ini aktif di grup musik Grass Rock, Blackout & Nicky Astria, Powerslaves and The Bangor. ");
        model.setImg(R.drawable.rere);
        models.add(model);

        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
