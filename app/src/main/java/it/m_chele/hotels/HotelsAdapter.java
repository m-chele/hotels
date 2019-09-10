package it.m_chele.hotels;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelViewHolder> {
    private List<Hotel> hotels;

    public HotelsAdapter(List<Hotel> hotels) {

        this.hotels = hotels;
    }

    @NonNull
    @Override
    public HotelsAdapter.HotelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hotel_list_item, viewGroup, false);
        return new HotelViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelsAdapter.HotelViewHolder hotelViewHolder, int i) {
        Hotel hotel = hotels.get(i);
//        hotelViewHolder.images.caricaUrls(hotel.images);
        hotelViewHolder.name.setText(hotel.name);
        hotelViewHolder.stars.setText(String.format("%d stelle", hotel.stars));
        hotelViewHolder.address.setText(String.format("Indirizzo %s", hotel.address));
        hotelViewHolder.rating.setText(String.format(Locale.ITALY, "Valutazione utenti %.1f", 9.8));
        hotelViewHolder.phone.setText(String.format("Tel: %s", hotel.phone));
        hotelViewHolder.email.setText(String.format("Email: %s", hotel.email));
        hotelViewHolder.checkin.setText(String.format("Check-in: %s", hotel.checkin));
        hotelViewHolder.checkout.setText(String.format("Check-in: %s", hotel.checkout));
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        public ImageView images;
        public TextView name;
        public TextView stars;
        public TextView address;
        public TextView rating;
        public TextView phone;
        public TextView email;
        public TextView checkin;
        public TextView checkout;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);

            images = itemView.findViewById(R.id.hotel_images);
            name = itemView.findViewById(R.id.hotel_name);
            stars = itemView.findViewById(R.id.hotel_stars);
            address = itemView.findViewById(R.id.hotel_address);
            rating = itemView.findViewById(R.id.hotel_rating);
            phone = itemView.findViewById(R.id.hotel_phone);
            email = itemView.findViewById(R.id.hotel_email);
            checkin = itemView.findViewById(R.id.hotel_checkin);
            checkout = itemView.findViewById(R.id.hotel_checkout);
        }
    }
}
