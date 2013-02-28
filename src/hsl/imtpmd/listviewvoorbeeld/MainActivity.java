package hsl.imtpmd.listviewvoorbeeld;

import hsl.imtpmd.listviewvoorbeeld.model.MyListItem;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends Activity
{	
	//deze methode overriden we zodat we commando's kunnen uitvoeren zodra de applicatie is opgestart
	//we voeren bijna nooit commando's uit in de constructor van een userinterface object, maar in de onCreate(...)
	//de onCreate van deze Activity klasse wordt door Android aangeroepen als deze eenmaal goed en wel draait
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //we willen een lijst zien met data uit een reeks van MyListView objecten
        //we halen eerst het ListView object op dat we in activity_main.xml hebben gedefinieerd m.b.v. findViewById( R.id.object_id )
        ListView listView = (ListView) this.findViewById( R.id.listview );
        
        
        //we maken een nieuwe arraylist waar we al onze data in zetten
        ArrayList<MyListItem> itemArrayList = new ArrayList<MyListItem>();
        
        //en we voegen wat data aan de arraylist
       	itemArrayList.add( new MyListItem( "Optie 1" ) );
       	itemArrayList.add( new MyListItem( "Optie 2" ) );
       	itemArrayList.add( new MyListItem( "Android is cool" ) );
       	itemArrayList.add( new MyListItem( "ListView is lastig" ) );
       	itemArrayList.add( new MyListItem( "Blauw is mooi" ) );
       	itemArrayList.add( new MyListItem( "Groen is mooier" ) );
       	itemArrayList.add( new MyListItem( "Java is leuk" ) );
       	itemArrayList.add( new MyListItem( "Optie 8" ) );
       	itemArrayList.add( new MyListItem( "Optie 9" ) );
       	itemArrayList.add( new MyListItem( "Optie 10" ) );
       	itemArrayList.add( new MyListItem( "Dit is een optie met heel veel text" ) );
       	itemArrayList.add( new MyListItem( "Ik accepteer de gebruiksvoorwaarden" ) );
       	itemArrayList.add( new MyListItem( "Stuur mij een nieuwsbrief" ) );
       	itemArrayList.add( new MyListItem( "Optie 14" ) );
       	itemArrayList.add( new MyListItem( "Optie 15" ) );
        
        
        //we maken tot slot een adapter aan die de data (de arraylist) en de lijst (de listview) aan elkaar koppelt
        //eerst een nieuwe adapter maken waar we de data (arraylist) aan meegeven
		MyListAdapter arrayAdapter = new MyListAdapter( ... );
		
		//dan de adapter aan de lijst koppelen
		listView.setAdapter( ... );
		
		
		//op deze manier hebben we een complete scheiding tussen businesslaag en presentatielaag
		//de adapter is de mediator tussen de twee lagen, alle communicatie van en naar beide lagen verloopt via de adapter
    }

    
    //deze methode overriden we en vullen we zelf in, zodat we een werkende menubalk hebben
    //de code wordt automatisch gegenereerd bij het maken van een nieuw android project
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
