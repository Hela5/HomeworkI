'use strict';

(function () {
    var app = angular.module('immuta.homework', ['ui-leaflet']);

    app.controller('MapController', MapController);
    MapController.$inject = ['$scope'];

    function MapController($scope) {
        // TODO Implement controller to load top data points
    $.ajax({
        url: "https://opendata.maryland.gov/resource/gja3-vy5r.json",
        type: "GET",
        data: {
          "$limit" : 5000,
          //"$$app_token" : "YOURAPPTOKENHERE"
        }
    }).done(function(data) {
      alert("Retrieved " + data.length + " records from the dataset!");
      console.log(data);
    });

    }
}());