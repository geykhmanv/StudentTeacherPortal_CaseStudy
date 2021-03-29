<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
      
        <title>QuickPortal - Assign Faculty</title>
        <meta content="" name="description">
        <meta content="" name="keywords">
      
        <%@include file="includes/header.jsp" %>
        
      
        <!-- =======================================================
        * Template Name: Anyar - v2.2.1
        * Template URL: https://bootstrapmade.com/anyar-free-multipurpose-one-page-bootstrap-theme/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->

        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 90%;
                margin-left: 30px;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #f3f2f7;
            }
        </style>

      </head>
      
<body>
    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>Manage Teacher Courses</h2>
	      <h6>Assign/Remove Courses </h6>
        </div>

        <div class="row mt-1 d-flex justify-content-end" data-aos="fade-right" data-aos-delay="100">

          <!-- <div class="col-lg-5">
            <div class="info">
              <div class="address">
                <i class="icofont-google-map"></i>
                <h4>Location:</h4>
                <p>A108 Adam Street, New York, NY 535022</p>
              </div>

              <div class="email">
                <i class="icofont-envelope"></i>
                <h4>Email:</h4>
                <p>info@example.com</p>
              </div> -->

              <!-- <div class="phone">
                <i class="icofont-phone"></i>
                <h4>Call:</h4>
                <p>+1 5589 55488 55s</p>
              </div> -->

            </div>

          </div>

          <div class="" data-aos="fade-left" data-aos-delay="100">
			<p style="margin-left:35px">${teacher.getFirstName()} ${teacher.getLastName()}'s Current Courses:</p>

			<table>
			
			<tr>
				<th>Course ID</th>
				<th>Course Name</th>
				<th>Remove Course</th>
			</tr>
			<c:forEach var="course" items="${teacher.getCourses()}">
				<tr>
					<td>${course.getId()}</td>
					<td>${course.getCourseName()}</td>
					<td><a href="${page.Context.request.contextPath}/remove-course-from-teacher/${teacher.id}/${course.id}" onclick="return confirm('Are you sure?')"> Remove</a></td>
				</tr>
			</c:forEach>
			</table><br><br>
		
			<p style="margin-left:35px">Choose a course to assign to ${teacher.getFirstName()} ${teacher.getLastName()}: </p>
			<form id="addCourseToTeacher" method="get" action="/add-course-to-teacher">
				<input style="border: solid 1px" name = "teacherId" value="${teacher.getId() }" hidden="true"/>
				<select style="margin-left:35px" name="newCourseId">
					<option value="none" selected disabled>Select a course</option>
					<c:forEach var="course" items="${courses}">
					  <option value="${course.getId()}">${course.getCourseName()}</option>
					</c:forEach>
				</select>
				<button style="margin-left:15px; margin-top: 10px" type=submit>Add</button>
			</form>

          </div>

       
    </section><!--End Contact Section -->
</body>
<!-- ======= Footer ======= -->
<footer id="footer">

  
  <div class="footer-top">
    <div class="container">
      <div class="row">

        <div class="col-lg-3 col-md-6 footer-links">
          <h4>Useful Links</h4>
          <ul>
            <li><i class="bx bx-chevron-right"></i> <a href="/index">Home</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="/dashboard">Dashboard</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Contact Us</a></li>
          </ul>
        </div>

        <!-- <div class="col-lg-3 col-md-6 footer-links">
          <h4>Our Services</h4>
          <ul>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
            <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
          </ul>
        </div> -->

        <div class="col-lg-3 col-md-6 footer-contact">
          <h4>Contact Us</h4>
          <p>
            1111 First Street <br>
            Nowhere, NJ 535022<br>
            United States <br><br>
            <strong>Phone:</strong> +1 5589 55488 55<br>
            <strong>Email:</strong> admin@bluebadgers.com<br>
          </p>

        </div>

        <div class="col-lg-3 col-md-6 footer-info">
          <h3>About QuickPortal</h3>
          <p>Access your university's information quickly and easily</p>
          <!-- <div class="social-links mt-3">
            <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
            <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
            <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
            <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
            <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
          </div> -->
        </div>

      </div>
    </div>
  </div>

  <div class="container">
    <div class="copyright">
      &copy; Copyright <strong><span>Anyar</span></strong>. All Rights Reserved
    </div>
    <div class="credits">
      <!-- All the links in the footer should remain intact. -->
      <!-- You can delete the links only if you purchased the pro version. -->
      <!-- Licensing information: https://bootstrapmade.com/license/ -->
      <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/anyar-free-multipurpose-one-page-bootstrap-theme/ -->
      Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
    </div>
  </div>
</footer><!-- End Footer -->

<a href="#" class="back-to-top"><i class="ri-arrow-up-line"></i></a>
<div id="preloader"></div>

<script type="text/javascript" src="assets/js/util.js"></script>

</html>