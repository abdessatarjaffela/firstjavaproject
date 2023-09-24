public class Animal {
 String family;
 String name;
 int age;
 boolean isMammal;

 public Animal(String family, String name, int age, boolean isMammal) {
  this.family = family;
  this.name = name;
  this.age = age;
  this.isMammal = isMammal;
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
  this.age = age;
 }

 public boolean isMammal() {
  return isMammal;
 }

 public void setMammal(boolean mammal) {
  isMammal = mammal;
 }
 @Override
 public String toString() {
  return "Animal [Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal + "]";
 }

}

