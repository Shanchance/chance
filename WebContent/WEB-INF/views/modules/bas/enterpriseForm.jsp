<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="default">
<title>企业添加</title>
<script type="text/javascript">
		$(document).ready(function() {
			$("#value").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<!-- 1.tab头部 -->
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/bas/enterprise/">企业列表</a></li>
		<li class="active"><a href="">企业${not empty enterprise.id?'修改':'添加'}</a></li>
	</ul>
	<br/>
	<sys:message content="${message}"></sys:message>
	
	<!-- 2.表单 -->
	<form:form id="inputForm" method="post" action="${ctx}/bas/enterprise/save" modelAttribute="enterprise" class="form-horizontal">
		<form:hidden path="id"/>
		<div class="control-group">
			<label class="control-label">企业名称：</label>
			<div class="controls">
				<form:input path="enterName" htmlEscape="false" maxlength="50" class="required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">组织机构代码：</label>
			<div class="controls">
				<form:input path="enterCode" htmlEscape="false" maxlength="50" class="required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">企业层次：</label>
			<div class="controls">
				<form:input path="enterLevel" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">企业性质：</label>
			<div class="controls">
				<form:input path="enterNature" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">企业注册资本：</label>
			<div class="controls">
				<form:input path="enterCapital" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
			<div class="control-group">
			<label class="control-label">法人：</label>
			<div class="controls">
				<form:input path="enterLperson" htmlEscape="false" maxlength="50" class="required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">法人身份证：</label>
			<div class="controls">
				<form:input path="enterLpCard" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">地址：</label>
			<div class="controls">
				<form:input path="enterAddress" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">邮政编码：</label>
			<div class="controls">
				<form:input path="emailCode" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="enterRemarks" htmlEscape="false" maxlength="150"/>
			</div>
		</div>
		
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>