<!DOCTYPE html>
<html><head>
    <meta http-equiv='X-UA-Compatible' content='IE=edge' />
    <title>Table example</title>

    <!-- Load UI5, select gold reflection theme and the "commons" and "table" control libraries -->
    <script id='sap-ui-bootstrap' type='text/javascript'
            src='resources/sap-ui-core.js'
            data-sap-ui-theme='sap_goldreflection'
            data-sap-ui-libs='sap.ui.commons,sap.ui.table'></script>

    <script>

        // create the DataTable control
        var oTable = new sap.ui.table.Table({editable:true});

        // define the Table columns
        var oControl = new sap.ui.commons.TextView({text:"{RESULT/TGROUP}"}); // short binding notation
        oTable.addColumn(new sap.ui.table.Column({label: new sap.ui.commons.Label({text: "Group"}), template: oControl }));

        var oControl = new sap.ui.commons.TextView({text:"{RESULT/TGROUP_TXT}"}); // short binding notation
        oTable.addColumn(new sap.ui.table.Column({label: new sap.ui.commons.Label({text: "Group Text"}), template: oControl }));

        // create a JSONModel, fill in the data and bind the Table to this model
        var oModel = new sap.ui.model.json.JSONModel();

        var aData = $.ajax({
            type: "GET",
            url: "services/dept",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data) {
                var jsonData = data;
                oModel.setData(jsonData);
            }
        });

        oTable.setModel(oModel);
        oTable.bindRows("/RESULTS");

        // finally place the Table into the UI
        oTable.placeAt("content");

    </script>

</head>
<body class='sapUiBody'>
<div id='content'></div>
</body>
</html>