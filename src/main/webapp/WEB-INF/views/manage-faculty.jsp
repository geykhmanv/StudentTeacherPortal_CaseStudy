<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
      
        <title>QuickPortal - Manage Faculty</title>
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
          <h2>Manage Faculty</h2>
          <h6>Search or remove faculty at University</h6>
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

            <form class="php-email-form" id="searchTeachersForm" method="post" action="/manage-faculty">
              <div class="form-row">
                <div class="col-md-6 form-group">
                  <input type="text" name="id" class="form-control" id="teacherId" placeholder="Search By Faculty ID" value="${searchCriteriaId}"/>
                  <div class="validate"></div>
                </div>
                <div class="col-md-6 form-group">
                  <input type="text" class="form-control" name="lastName" id="teacherName" placeholder="Search By Faculty Last Name" value="${searchCriteriaLastName}" />
                  <div class="validate"></div>
                </div>
              </div>
              
              <div class="text-center">
              	<button type="submit">Search</button> 
             	<button type="submit" onclick="clearTeacherSearch()">Clear Search</button>             	
              </div>        

            </form>
            
             <form class="php-email-form" id="addFacultyForm" action="/add-faculty">
	             <div class="text-center">	              	
	             	<button type="submit">Add a Faculty Member</button>              	
	              </div> 
	         </form>
            
            <!--Show teachers Search results -->            
            <c:if test="${teachers != null && teachers.size() > 0}">
	           
	            <table>	            	
	                <tr>
	                  <th>Faculty ID</th>
	                  <th>Faculty Name</th>
	                  <th>Faculty Title</th>
	                  <th>Email</th>
	                  <th>Remove Faculty Member</th>
	                </tr>
	                
	                <c:forEach var="teacher" items="${teachers}">
		                <tr>
		                  <td>${teacher.getId()}</td>
		                  <td>${teacher.getLastName()}, ${teacher.getFirstName()}</td>
		                  <td>${teacher.getTitle()}</td>
		                  <td>${teacher.getEmail()}</td>
		                  <td><a href="${page.Context.request.contextPath}/delete/${teacher.id}" onclick="return confirm('Are you sure?')"> Delete</a></td>
		                </tr>
	                </c:forEach>
	                
	              </table><br><br>
	         </c:if>
              
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