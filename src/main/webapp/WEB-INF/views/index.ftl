<!DOCTYPE html>
<html>
<head>
    <link href="/resources/static/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="/resources/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="/resources/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
</head>
<body>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

<div id="login-overlay" class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">

            <h4 class="modal-title" id="myModalLabel">Welcome to "Job Portal"</h4>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-xs-6">
                    <div class="well">
                        <form id="loginForm" method="POST" action="/login/" novalidate="novalidate">
                            <div class="form-group">
                                <p>Please login before entering</p>
                                <label for="username" class="control-label">Username</label>
                                <input type="text" class="form-control" id="username" name="username" value=""
                                       required="" title="Please enter you username" placeholder="example@gmail.com">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label for="password" class="control-label">Password</label>
                                <input type="password" class="form-control" id="password" name="password" value=""
                                       required="" title="Please enter your password">
                                <span class="help-block"></span>
                            </div>
                            <div id="loginErrorMsg" class="alert alert-error hide">Wrong username og password</div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" name="remember" id="remember"> Remember login
                                </label>
                                <p class="help-block">(if this is a private computer)</p>
                            </div>
                            <button type="submit" class="btn btn-success btn-block">Login</button>
                            <a href="/forgot/" class="btn btn-default btn-block">Help to login</a>
                        </form>
                    </div>
                </div>
                <div class="col-xs-6">
                    <p class="lead">Register now for <span class="text-success">FREE</span></p>
                    <ul class="list-unstyled" style="line-height: 2">
                        <li><span class="fa fa-check text-success"></span> See all your orders</li>
                        <li><span class="fa fa-check text-success"></span> Fast re-order</li>
                        <li><span class="fa fa-check text-success"></span> Save your favorites</li>
                        <li><span class="fa fa-check text-success"></span> Fast checkout</li>
                        <li><span class="fa fa-check text-success"></span> Get a gift
                            <small>(only new customers)</small>
                        </li>
                        <li><a href="/read-more/"><u>Read more</u></a></li>
                    </ul>
                    <p><a href="/create-employer/" class="btn btn-info btn-block">Register as an Employer</a></p>
                    <p><a href="/create-applicant/" class="btn btn-info btn-block">Register as an Applicant</a></p>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>