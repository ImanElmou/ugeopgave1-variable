void main() {

    //opgave 1 shoppping cart
    double item1 = 25.50;
    double item2 = 15.00;
    double item3 = 30.00;
    double subtotal = item1 + item2 + item3;
    System.out.println(subtotal);
    double taxRate = 25.0;
    double withTax = subtotal + (subtotal * taxRate / 100.0);
    System.out.println(withTax);

    //opgave 2 split restaurant bill

    double foodTotal = 450.0;
    double drinks = 120.0;
    double tip = 50.0;
    int people = 4;
    double grandTotal = foodTotal + drinks + tip;
    double perPerson = grandTotal / people;
    System.out.print(perPerson);


    //opgave 3 Discount calculation
    double originalPrice = 300.0;
    double discountPercent = 20.0;
    double discounted = originalPrice - (originalPrice * discountPercent / 100.0);
    double taxPercent = 25.0;
    double finalPrice = discounted + (discounted * taxPercent / 100.0);
    System.out.println(originalPrice);
    System.out.println(discounted);
    System.out.println(finalPrice);


    //opgave 4 Party Planning
    int guests = 15;
    int cupcakes = 40;
    int cupcakesPerGuest = cupcakes / guests;
    int leftovers = cupcakes % guests;
    System.out.println("Each guest gets" + cupcakesPerGuest + "cupcakes");
    System.out.println(leftovers + "cupcakes left over");


    //opgave 5 Build greeting message
    StringBuilder sb = new StringBuilder();
    String name = "Iman";
    int age = 22;
    sb.append("Hello, ");
    sb.append(name);
    sb.append("! ");
    sb.append("You are ");
    sb.append(age);
    sb.append(" years old.");
    System.out.println(sb.toString());


    //opgave 6 Using +=
    int score = 100;
    System.out.println(score);
    score += 50;
    System.out.println(score);
    score += 25;
    System.out.println(score);


    //opgave 7 Using -=
    int health = 100;
    health -= 15;
    System.out.println(health);
    health -= 20;
    System.out.print(health);


    //opgave 8 Using *=
    double price = 50.0;
    System.out.println(price);
    price *= 2;
    System.out.println(price);


    //opgave 9 Increment og decrement with 1
    int counter = 10;
    System.out.println(counter);
    counter++;
    System.out.println(counter);
    counter--;
    System.out.println(counter);


    //opgave 10 All compound operators
    int number = 10;
    number += 5;
    System.out.println(number);
    number -= 3;
    System.out.println(number);
    number++;
    System.out.println(number);
    number--;
    System.out.println(number);


    //opgave 11 E-commerce product
    String productName = "laptop";
    double productPrice = 7999.99;
    boolean inStock = true;
    int stockQuantity = 15;
    double discountPercentPerItem = 10.0;
    String category = "electronics";


    //opgave 12 Grades system
    String StudentName = "Anna";
    int testScore = 85;
    int homeworkScore = 92;
    double finalScore = 88.5;
    boolean passedCourse = true;


    //opgave 13 Bookingsystem
    String guestName = "Peter Hansen";
    int roomNumber = 204;
    int numberOfNight = 3;
    double pricePerNight = 899.00;
    boolean breakfastIncluded = true;
    double totalCost = 2697.00;


    //opgave 14 Fitness-tracker
    int stepsToday = 8547;
    int goalSteps = 10000;
    double distanceKm = 6.2;
    int caloriesBurned = 420;
    boolean goalReached = false;


    //opgave 15 Library system
    String booksTitle = "Java Programing";
    String authorName = "John Smith";
    String isbn = "978-0-123456-78-9";
    int numberOfPages = 456;
    boolean isAvailable = true;
    String currentBorrower = "";
    String dueDate = "2026-02-01";
    double fineAmount = 0.0;
    boolean isBestseller = true;
    double rating = 4.5;


}