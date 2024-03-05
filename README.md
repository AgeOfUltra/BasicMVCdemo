<h2>Spring MVC Demo using Annotations</h2>

<strong>Description</strong>

<p>This Repository contains the demo spring mvc framework.</p>
<p>This repository have the simple jsp pages where we reform the simple addition of 2 numbers using the spring mvc framework</p>

<h2>Files we have in the repo</h2>
<ul>
  <li>index.jsp</li>
  <li>display.jsp</li>
  <li>MyWebInitializer.java</li>
  <li>AddController.java</li>
  <li>AddService.java</li>
  <li>ProjectConfig.java</li>
  
</ul>

<p>
  In the index.jsp when we enter the 2 numbers and click on the submit we are trying to send the request to the tomcat server for action add
</p>
<p>
 -> Now the tomcat server invokes the displatcher servlet which is a front controller (manages the controllers) for every request wil the "/" pattern match, now the front controller will specify the exact controller which has "/add" pattern </p>
  <p> ->After identifying the controller for the requested action, perform the bussiness logic using the AddServices.java which is annotatted with @service and perform the simple addition and retuen it the controler./p>
<p> -> Now the returned result is stored in the ModelAndView and passed to the specific page which is configured using the setViewName method from the ModelAndView class and under what attribute name we are storing the value and it is configured 
  by the addObject() method.</p>

 <p> Here the ProjectConfig class helps to locate the at which package all our controller and services are present using the component scan.
  And we have created a bean which will help us for the resolve the view name from the controller class , it is used for the adoptaion of the view technology in the future.
</p>
<p>Finally using the jsp expression we access the object and view the result in the display.jsp</p>

<p>#NOTE:- LET ME KNOW IF ANY MISTAKE IN MY DISCRIPTION, AND HELP ME TO IDENTIFY IT.</p>
