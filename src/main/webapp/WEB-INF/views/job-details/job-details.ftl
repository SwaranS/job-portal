<DOCTYPE! html>'
<html>
<#include "header.ftl">

<body class="container-fluid">
<h2>
    Job Details
</h2>
<form>
    <div class="form-group">
        <label for="job_deets">Job Details:</label>
        <textarea class="form-control" rows="5" id="job_deets"></textarea>
    </div>
    <div class="form-group">
        <label for="">Vacancy Available:</label>
        <input type="number" class="form-control" id="vacc" placeholder="Vacancy Available" name="vacc">
    </div>
    <div class="form-group">
        <label for="com_description">Job post date:</label>
        <input type="date" class="form-control" id="post_date" placeholder="Job post date" name="post_date">
    </div>
    <div class="form-group">
        <label for="com_email">Job start date:</label>
        <input type="date" class="form-control" id="start_date" placeholder="Job start date" name="start_date">
    </div>
    <div class="form-group">
        <label for="sel1">Select list:</label>
        <select class="form-control" id="sel1">
            <option>Select..</option>
            <option><b>Open</b></option>
            <option><b>Filled</b></option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
