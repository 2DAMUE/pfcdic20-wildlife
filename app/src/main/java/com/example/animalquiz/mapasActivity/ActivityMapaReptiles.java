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

public class ActivityMapaReptiles extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_reptiles);
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

        LatLng gala = new LatLng(39.8952029, -4.498363);
        mMap.addMarker(new MarkerOptions().position(gala).title("Galapago Leproso").snippet(" tortuga acuática autóctona de la península ibérica .")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));

        LatLng ser = new LatLng(20.6240398, -105.2224511);
        mMap.addMarker(new MarkerOptions().position(ser).title("Serpiente del Lodo").snippet(" Habita en el sureste de Estados Unidos. .")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));


        LatLng boa = new LatLng(-38.7109724, -62.285936);
        mMap.addMarker(new MarkerOptions().position(boa).title("Boa Constrictor").snippet(" esta boa habita a lo largo de las vertientes del Pacífico y del Golfo, en los estados del sur – sureste y en el centro del país.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));

        LatLng krait = new LatLng(22.3511148, 78.6677428);
        mMap.addMarker(new MarkerOptions().position(krait).title("Krait rayado").snippet(" Krait comunes residen en la India y parte del sudeste de Asia")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));

        LatLng dia = new LatLng(28.1135127, -16.554451);
        mMap.addMarker(new MarkerOptions().position(dia).title("Diablo Espinoso").snippet("Principalmente, los diablos espinosos se encuentran al oeste y al norte del Gran Desierto.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));


        LatLng negra = new LatLng(34.68971, -118.28869);
        mMap.addMarker(new MarkerOptions().position(negra).title("Mamba Negra").snippet("vive en las sabanas y las colinas rocosas del sur y el este de África")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));

        LatLng dra = new LatLng(-24.7761086, 134.755);
        mMap.addMarker(new MarkerOptions().position(dra).title("Dragon De Mar").snippet("es originario de las costas del sur de Australia")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));

        LatLng tila = new LatLng(-16.5424765, -68.0694167);
        mMap.addMarker(new MarkerOptions().position(tila).title("Tilapia").snippet("Se encuentra distribuida como especie exótica por América Central, sur del Caribe, sur de Norteamérica y el sureste asiático")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sanake)));





        mMap.moveCamera(CameraUpdateFactory.newLatLng(gala));
    }
}
