package com.example.animalquiz.mapasActivity;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.animalquiz.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMapaMamiferos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_mamiferos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng lince = new LatLng(37.4168693, -5.9738244);
        mMap.addMarker(new MarkerOptions().position(lince).title("Lince Iberico").snippet("El lince iberico se encuentra en la peninsula ibérica")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));


        LatLng leon = new LatLng(-0.7264327, 15.6419155);
        mMap.addMarker(new MarkerOptions().position(leon).title("Leon").snippet("El Leon se encuentra en Africa subsajariana")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng hiena = new LatLng(-2.736993394956997, 23.876832439986572);
        mMap.addMarker(new MarkerOptions().position(hiena).title("hiena").snippet("La hiena se encuentra en Africa subsajariana")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng rebeco = new LatLng(52.5062092, 13.5358683);
        mMap.addMarker(new MarkerOptions().position(rebeco).title("Rebeco").snippet("El Rebeco se encuentra en zonas montañosas de Europa, como los Cárpatos, los Alpes, el Cáucaso, y ciertas zonas montañosas de los Balcanes")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng osoG = new LatLng(61.0666922, 107.9917071);
        mMap.addMarker(new MarkerOptions().position(osoG).title("Osso Grizzliz").snippet("Los grizzlies viven en el noroeste de Estados Unidos, Canadá y península de Kamchatka (Siberia). La mayor población habita en Alaska.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));


        LatLng jirafa = new LatLng(9.102094218395024, 15.055167900037816);
        mMap.addMarker(new MarkerOptions().position(jirafa).title("Jirafa" +
                "").snippet("La hiena se encuentra en Africa subsajariana")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));


        LatLng orni = new LatLng(-54.6318143, 158.8617576);
        mMap.addMarker(new MarkerOptions().position(orni).title("Ornitorrinco").snippet("es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng jagu = new LatLng(34.395342, -111.7632755);
        mMap.addMarker(new MarkerOptions().position(jagu).title("Jaguar").snippet("es un carnívoro félido de la subfamilia de los Panterinos y género Panthera.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng tigrB = new LatLng(28.1083929, 84.0917139);
        mMap.addMarker(new MarkerOptions().position(tigrB).title("Tigre Bengala").snippet("Es una subespecie de tigre que habita en la India")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));

        LatLng osoP = new LatLng(43.1595664, -4.0878382);
        mMap.addMarker(new MarkerOptions().position(osoP).title("Oso Pardo").snippet("Es la especie de oso más extendida del planeta. Estos gigantes omnívoros suelen ser solitarios")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapahuella)));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(lince));
    }
}
