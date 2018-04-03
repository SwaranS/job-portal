<!DOCTYPE html>
<html lang="en">
<#include "header.ftl">
<body>
<div class="container-fluid">
    <h2>Applicant's Details</h2>
    <form>
        <div class="form-group">
            <label for="app_name">Applicant's Name:</label>
            <input type="name" class="form-control" id="app_name" placeholder="Enter Name" name="app_name">
        </div>
        <div class="form-group">
            <label for="email">Applicant's Email:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
        </div>
        <div class="form-group">
            <label for="age">Applicant's Age:</label>
            <input type="age" class="form-control" id="age" placeholder="Enter Age" name="age">
        </div>


        <label>Applicant's Gender:</label>
        <div class="radio">
            <label><input type="radio" name="optradio">Male</label>
        </div>
        <div class="radio">
            <label><input type="radio" name="optradio">Female</label>
        </div>
        <div class="radio">
            <label><input type="radio" name="optradio">Others</label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>
