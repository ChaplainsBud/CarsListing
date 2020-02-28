How do I create a category that is one to many with cars? 

1. Do I need to add a Set<>  HashSet<> to my HomeController?
-> I can only get a new category to show
-> I cannot get cars to show
-> I cannot get cars to show with a new category

2. BUG: When I push Car Listing, I do not see the table
of categories/cars. I see the one category repeatedly show
itself..... and the original category/cars move down a list.

3. Do I need this? 

<!--<ul>-->
<!--    <th:block th:each="car : ${category.cars}">-->
<!--        <li th:inline="text"><b>[[${car.model}]]</b>-->
<!--            released in-->
<!--            [[${car.year}]].-->
<!--        </li>-->
<!--    </th:block>-->
<!--</ul>-->

```
ToDo List allows create, read, update, and delete
One to Many: a director has movies...

Potential Conflict: I can add/delete todos, but can I add/delete
a table one2many tables? 

I can create a one2many table scenario. Can I reproduce this?

Will I need to instantiate objects, not just one2many,
but additional one2many collections? 

How do I create?
How do I access? 

3.03; p. 47

```

I. Backend:

H2 Database

A. Category Class

i. Each Category, ONE, has Cars... MANY 
ii. Cars Class, MANY , has Category... ONE 


II. UI: 

A. navbar: logo, carListing, addCategory, addCar

B. Jumbotron: Name of Company with background

C. No Footer

a. Cars Listing: Displays all the Beans with content

i. Cards: name, image, button 

ex. BMW, Pic, More Info

b. Add Category:
 
i. Add Category. Receives a new 

One Input 

ii. Form: 
 
6 inputs

Manufacture
Model
Year
MSRP 
Category
Upload Image 

submit button   

iii. Add Car. Not sure how ii && iii are different. 

ii == enter an individual form, go to series of inputs

iii == start with series of inputs 

