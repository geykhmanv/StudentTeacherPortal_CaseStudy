# StudentTeacherPortal_CaseStudy

PROJECT DESCRIPTION:

QuickPortal is a University management system.  From the home page, one can access the university's contact information or visit the Dashboard, where there are several options.  An administrative user can access the Manage Faculty option where all the current faculty members are displayed.  Those faculty members can be updated, removed, or assigned to a course they teach in the university.  The administrator can also add faculty members to the database using QuickPortal's functionality.  The other options from the dashboard include searching the students attending the university as well as searching the courses offered at the university.

USER STORIES:

As a visitor to the admin portal I want to select the dashboard option so that I can choose from the list of options.
As an admin I want to select the 'Manage Faculty' option from the dashboard so that I can access and maintain faculty records (add/remove faculty, update faculty, search faculty).
As a visitor I want to select the 'Search Classes' option from the dashboard so that I can search the classes offered at University.
As an admin I want to select the 'Search Student Body' option from the dashboard so that I can search the students attending University.

REACH GOALS:

Currently, there is no login option to access QuickPortal.  Any user can start from the Home page and choose any option from the Dashboard.  A reach goal would be to include a Log In portal, that differentiates between an administrative user and a student user.  Admins are allowed to Manage Faculty, Manage the Student Body, and Manage the Courses (add, remove, update), while a student user can only search the Faculty, the student body, and the courses offered.  A student user would also be able to register for an available course.  I would also add security regarding my users' passwords and have them hashed.

STRUGGLES:

Setting up the project configuration was a lengthy struggle, as I created the front-end of my application using a Bootstrap template, and none of the CSS would render in my Web Dynamic Project created in Eclipse.  After many attempts, I decided to try setting up a Spring Boot application, and it was successful.  Using Spring Boot with JPA was somewhat different to the methods discussed in class, but I found it easy to adapt and learn the somewhat "sleaker", and for me, more intuitive way of completing the CRUD operations for my application.  If given more time, I would love to implement my reach goals and restructure my application to resemble some of the university portal's I've seen and used myself.  Lastly, I would also plan to refactor some of my code to account for certain exceptions as well as create a more efficient code structure.

***DB Schema and DB creation file located in src/main/resources/SQL
