/*
 (c) Copyright 2012 Hewlett-Packard Development Company, L.P.
 Autogenerated
 */

// JSLint directive...
/*global $: false*/

(function (api) {
    'use strict';

    //framework APIs
    var f = api.fn,     //general API
        def = api.def,  //application definition API
        v = api.view;   //view API

    f.trace('including viplink.js');

    // Create a view with a toolbar button
    function load(view) {
        v.setToolbar(def.tbButton(view.mkId('btn'), view.lion('button'), '', 
                                  function () {
            $.get('/sdn/ui/VIP/app/rs/viplink', function(data) {
                v.setContent($('<span/>').append(data));
            });
        }));
    }

    def.addView('viplink', {
        load: load
    });

    def.insertViewsAfter('exportLogs',
        def.addView('viplinkTab')
    );


}(SKI));
