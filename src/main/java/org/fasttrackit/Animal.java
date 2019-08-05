package org.fasttrackit;

public class Animal {

   private String name;
   private int age;
   private int levelOfHealth;
   private int levelOfHunger;
   private int levelOfMood;
   private String favoriteFood;
   private String favoriteRecreationalActivity;
   private String sex;

   public Animal(String name, int levelOfHunger) {
      this.name = name;
      this.levelOfHunger = levelOfHunger;
   }

   public void positiveMood (){
      System.out.println("Animal is dancing.");
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getLevelOfHealth() {
      return levelOfHealth;
   }

   public void setLevelOfHealth(int levelOfHealth) {
      this.levelOfHealth = levelOfHealth;
   }

   public int getLevelOfHunger() {
      return levelOfHunger;
   }

   public void setLevelOfHunger(int levelOfHunger) {
      this.levelOfHunger = levelOfHunger;
   }

   public int getLevelOfMood() {
      return levelOfMood;
   }

   public void setLevelOfMood(int levelOfMood) {
      this.levelOfMood = levelOfMood;
   }

   public String getFavoriteFood() {
      return favoriteFood;
   }

   public void setFavoriteFood(String favoriteFood) {
      this.favoriteFood = favoriteFood;
   }

   public String getFavoriteRecreationalActivity() {
      return favoriteRecreationalActivity;
   }

   public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
      this.favoriteRecreationalActivity = favoriteRecreationalActivity;
   }

   public String getSex() {
      return sex;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }
}
