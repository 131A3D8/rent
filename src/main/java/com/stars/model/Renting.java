package com.stars.model;

import java.math.BigDecimal;

public class Renting {
   private int id;
   private String rentingname;
   private BigDecimal rent;
   private String address;
   private String phone;
   private String distance;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getRentingname() {
      return rentingname;
   }

   public void setRentingname(String rentingname) {
      this.rentingname = rentingname;
   }

   public BigDecimal getRent() {
      return rent;
   }

   public void setRent(BigDecimal rent) {
      this.rent = rent;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getDistance() {
      return distance;
   }

   public void setDistance(String distance) {
      this.distance = distance;
   }
}
