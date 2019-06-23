<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Discussions</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">
    <link href="css/business-casual.min.css" rel="stylesheet">

   <!--  <script>
      function display(){
        var ques=document.getElementById("question").value;
        document.getElementById("Qu").innerHTML=ques;
      }

    </script> -->

  </head>

  <body>

    <h1 class="site-heading text-center text-white d-none d-lg-block">
     <span class="site-heading-upper text-primary mb-3" style="margin-bottom:5%;">Nirvana</span>
       <span class="site-heading-upper text-primary mb-3" style="font-size:15px;">"Love yourself enough to love your loved ones.."</span>
    </h1>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
      <div class="container">
        <a class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none" href="#">Nirvana</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav mx-auto">
            <li class="nav-item active px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="index.php">Get in Touch
              </a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="resources.php">Resources
              </a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="forum.php">Discussions</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="about.php">About Us</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <section class="page-section about-heading">
      <div class="container">
        <img class="img-fluid rounded about-heading-img mb-3 mb-lg-0" src="img/about.jpg" alt="">
        <div class="about-heading-content">
          <div class="row">
            <div class="col-xl-9 col-lg-10 mx-auto">
              <div class="bg-faded rounded p-5">
                <h2 class="section-heading mb-4">
                  <span class="section-heading-lower">Help..</span>
                </h2>
                  <div>
                    <?php
                    include "connect.php";
                    $sql="Select ques from questions";
                    $result=$conn->query($sql);
                    if($result->num_rows>0){
                      while($row=$result->fetch_assoc()){
                      ?>
                      <div>
                        <p><?php echo $row["ques"];  ?></p>
                        <form>
                        <input type="text" id="ans" name="ans"><br><br>
                        <input type="submit" value="Answer">
                      </form>
                      </div>
                      <?php
                      }}
                      else{
                        echo "0 results";
                      }
                      ?>
        </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <footer class="footer text-faded text-center py-5">
      <div class="container">
        <p class="m-0 small">Copyright &copy; Nirvana</p>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
