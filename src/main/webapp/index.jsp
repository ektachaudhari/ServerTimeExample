<html>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<body>
	<div ng-app="myApp" ng-controller="serverController">
		<h1>Server Date and Time is:</h1>{{serverTime}}
	</div>

	<script>
		var app=angular.module('myApp',[]);
		
		app.controller('serverController',function($scope,$http,$interval){
			
			var getServerTime=function(){
				return $http.get("rest/currentserver/datetime");
			}
			
			$interval(getDateTime,5000);
			
			function getDateTime(){
				console.log("getserverTime:");
				getServerTime().success(function(response){
					//alert("response");
					$scope.serverTime=response;
					console.log("serverTime:"+response);
				}).error(function(response) {
 					alert("Error1"+response.status);
 				});
			};
		});	
		
		
	</script>

</body>
</html>
