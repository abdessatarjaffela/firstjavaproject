package tn.esprit.gestionzoo.entities;

public class Animal {
 private String family;
 private String name;
 private int age;
 private boolean isMammal;

 public Animal(String family, String name, int age, boolean isMammal) {
  setFamily(family);
  setName(name);
  setAge(age);
  setMammal(isMammal);
 }
 public String getFamily() {
  return family;
 }

 public void setFamily(String family) {
  this.family = family;
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
  if (age >= 0) {
   this.age = age;
  } else {
   System.out.println("Age cannot be negative.");
   this.age = 0;
  }
 }

 public boolean isMammal() {
  return isMammal;
 }

 public void setMammal(boolean mammal) {
  isMammal = mammal;
 }
 @Override
 public String toString() {
  return "tn.esprit.gestionzoo.entities.Animal [Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal + "]";
 }

}


