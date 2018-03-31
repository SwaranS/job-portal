<DOCTYPE! html>'
<html>
<head>
    <title>Company details form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/static/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="/resources/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="/resources/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>

</head>

<body class="container-fluid">
<h2>
    Company's Details
</h2>
<form>
    <div class="form-group">
        <label for="com_name">Company Name:</label>
        <input type="com_name" class="form-control" id="com_name" placeholder="Company Name" name="com_name">
    </div>
    <div class="form-group">
        <label for="com_type">Company Type:</label>
        <input type="com_type" class="form-control" id="com_type" placeholder="Company Type" name="com_type">
    </div>
    <div class="form-group">
        <label for="com_desc">Company Description:</label>
        <textarea class="form-control" rows="5" id="com_desc"></textarea>
    </div>
    <div class="form-group">
        <label for="com_email">Company Email:</label>
        <input type="com_email" class="form-control" id="com_email" placeholder="Company Email" name="com_email">
    </div>
    <div class="form-group">
        <label for="com_name">Company Website:</label>
        <input type="webpage" class="form-control" id="com_website" placeholder="Company Website" name="com_website">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>

</html>