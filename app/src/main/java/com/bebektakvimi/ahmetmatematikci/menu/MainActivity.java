package com.bebektakvimi.ahmetmatematikci.menu;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.ana_menu, menu);

    /*
    Resources res = this.getResources();

    MenuItem itm1 = menu.add("Dosya");
    itm1.setNumericShortcut('1');
    itm1.setIcon(res.getDrawable(R.drawable.dosya));
    itm1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
            {
                @Override
                public boolean onMenuItemClick(MenuItem item)
                {
                    Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                    return false;
                }
            });

    MenuItem itm2 = menu.add("Yardım");
    itm2.setNumericShortcut('2');
    itm2.setIcon(res.getDrawable(R.drawable.help));
    itm2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
    {
        @Override
        public boolean onMenuItemClick(MenuItem item)
        {
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setMessage(item.getTitle());
            dlg.setTitle("Seçilen eleman");
            dlg.setPositiveButton("Tamam", null);
            dlg.show();
            return true;
        }
    });
    */

        return true;
    }

    public void mnuFile_Click(MenuItem item)
    {
        Toast.makeText(this, item.getTitle() + " seçildi", Toast.LENGTH_LONG).show();
    }

    public void mnuEdit_Click(MenuItem item)
    {
        Toast.makeText(this, item.getTitle() + " seçildi", Toast.LENGTH_LONG).show();
    }

    public void mnuRun_Click(MenuItem item)
    {
        Toast.makeText(this, item.getTitle() + " seçildi", Toast.LENGTH_LONG).show();
    }

    public void mnuHelp_Click(MenuItem item)
    {
        Toast.makeText(this, item.getTitle() + " seçildi", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.mnuFile) {
            // File için yapılması istenilenler
        }

        if (id == R.id.mnuEdit) {
            // Edit için yapılması istenilenler
        }

        if (id == R.id.mnuRun) {
            // Run için yapılması istenilenler
        }

        if (id == R.id.mnuHelp) {
            // Help için yapılması istenilenler
        }

        return super.onOptionsItemSelected(item);
    }
}


