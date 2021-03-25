Ext.onReady(function() {
    var podform = Ext.create('Ext.form.Panel', {
        renderTo : 'regForm',
        fullscreen: true,
        width: '100%',
        border: false,
        items: [
            {
                xtype: 'fieldset',
                items: [
                    {
                        xtype: 'textfield',
                        label: 'name',
                        fieldLabel: 'Name',
                        anchor: '100%',
                        margin: '10 0 10 0',
                        allowBlank: false
                    },
                    {
                        xtype: 'textfield',
                        label: 'Username',
                        fieldLabel: 'Username',
                        anchor: '100%',
                        margin: '10 0 10 0'
                    },
                    {
                        xtype: 'textfield',
                        label: 'Password',
                        fieldLabel: 'Password',
                        anchor: '100%',
                        margin: '10 0 10 0'
                    },
                    {
                        xtype: 'datefield',
                        label: 'Date picker',
                        fieldLabel: 'Date Of Birth',
                        anchor: '100%'
                    },

                    {
                        xtype: 'fieldcontainer',
                        fieldLabel: 'Gender',
                        defaultType: 'radiofield',
                        layout: 'hbox',
                        items: [{
                           boxLabel: 'Male',
                           inputValue: 'M',
                           id: 'radio1',
                           margin: '0 10 0 0'
                        },{
                           boxLabel: 'Female',
                           inputValue: 'F',
                           id: 'radio2'
                        }]
                    },
                    {
                        buttonAlign: 'center',
                        buttons: [{
                            xtype: 'button',
                            text: 'Submit',
                            handler: function(){
                                podform.getForm().submit({url:'/index2.jsp', waitMsg:'Saving Data...', submitEmptyText: false});
                            }
                        }] 
                    }

                ]
            }
        ]
    });
})
    