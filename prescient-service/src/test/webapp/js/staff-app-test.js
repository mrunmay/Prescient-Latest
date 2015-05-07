describe('Unit: staff app', function () {

    // Load the module with MainController
    beforeEach(angular.mock.module('staff_app'));

    var ctrl, scope;
   // var browser;
    // inject the $controller and $rootScope services
    // in the beforeEach block
    beforeEach(inject(function ($controller, $rootScope, $cookieStore,$location,$window) {
        // Create a new scope that's a child of the $rootScope
        scope = $rootScope.$new();
       // browser=$browser;



        var user = {};
        user.name = 'mrunmay';
        var type = {};
        type.value = 'ROLE_STAFF';
        user.userType = type;

        $cookieStore.put("user", user);
        // Create the controller
        ctrl = $controller('staff_app_controller', {
            $scope: scope
          });

     }));

    it('Testing the staff application controller', function () {
        console.log('test is successful');
    });

    it('On logout cookies should be clear',function(){
        console.log('Before logout data should be in cookie');
        // scope.logout();
        //ctrl.logout = jasmine.createSpy("getName spy");
        //spyOn(ctrl,logout);
        //ctrl.logout();

        scope.logout();
       // browser.navigateTo('/index.html');

        console.log('logout successful');
    });
});