package in.co.knr.DrhContentProvider;

import android.app.*;
import android.os.*;
import android.content.*;
import android.database.*;
import android.net.*;
import android.database.sqlite.*;

public class DrhContentProvider extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    public class DrhProvider extends ContentProvider
    {

        @Override
        public boolean onCreate()
        {
            // TODO: Implement this method
            return false;
        }

        @Override
        public Cursor query(Uri p1, String[] p2, String p3, String[] p4, String p5)
        {
            // TODO: Implement this method
            return null;
        }

        @Override
        public String getType(Uri p1)
        {
            // TODO: Implement this method
            return null;
        }

        @Override
        public Uri insert(Uri p1, ContentValues p2)
        {
            // TODO: Implement this method
            return null;
        }

        @Override
        public int delete(Uri p1, String p2, String[] p3)
        {
            // TODO: Implement this method
            return 0;
        }

        @Override
        public int update(Uri p1, ContentValues p2, String p3, String[] p4)
        {
            // TODO: Implement this method
            return 0;
        }

        
    }
    
}
