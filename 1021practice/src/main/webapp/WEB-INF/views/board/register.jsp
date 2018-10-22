<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file="../includes/header.jsp"%>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Forms</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Form Elements
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="/board/register" method="post">
                                        <div class="form-group">
                                            <label>TITLE</label>
                                            <input class="form-control" name="title">
                                            <p class="help-block"></p>
                                        </div>
                                         <div class="form-group">
                                            <label>WRITER</label>
                                            <input class="form-control" name="writer">
                                            <p class="help-block"></p>
                                        </div>
                                       
                                        <div class="form-group">
                                            <label>CONTENT</label>
                                            <textarea class="form-control" rows="3" name="content"></textarea>
                                        </div>
                                        
                                        <button type="submit" class="btn btn-default">Submit Button</button>
                                        <button type="reset" class="btn btn-default">Reset Button</button>
                                    </form>
                                </div>
         
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
<%@include file="../includes/footer.jsp"%>

</body>

</html>
