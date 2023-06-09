<%@include file="taglib.jsp"%>
<c:set var="title" value="Get Your Weather!" />
<%@include file="head.jsp"%>

<html>
<body>
<div class="container">
    <h2 class="text-center"> Simple Java Weather App</h2>
    <div class="row justify-content-center">
        <form action="searchZip" class="form-inline">
            <div class="form-group p-2">
                <label for="zipcode" class="m-1 p-1">Get Weather!</label>

                <input type="text" class="form-control" id="zipcode" name="zipcode"
                       pattern="[0-9]*" title="Enter your Zipcode"
                       aria-describedby="searchZipcodeHelp" placeholder="Enter Zipcode">
            </div>
            <button type="submit" name="submit" value="search" class="btn btn-primary m-2">Get Weather</button>
        </form>
    </div>
    <div class="row justify-content-center">
        <div class="col-6 m-1 p-2 ">
            <div id="result"></div>
        </div>
    </div>

</div>
</body>
</html>
