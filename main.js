const electron = require('electron');
const url = require('url');
const path = require('path');
const Splashscreen = require('@trodi/electron-splashscreen');

var {app} = electron;

let mainWindow;

// Listen for app to be ready
app.on('ready', function()
{
    const windowOptions = {
        width: 885,
        height: 600,
        'minWidth': 710,
        'minHeight': 455,
        frame: false,
        webPreferences: {
        nodeIntegration: true
        },
        show: false
    };


    mainWindow = Splashscreen.initSplashScreen({
        windowOpts: windowOptions,
        templateUrl: path.join(__dirname, "assets\\html\\splashScreen.html"),
        delay: 0, // force show immediately since example will load fast
        minVisible: 3000, // show for 1.5s so example is obvious
        splashScreenOpts: {
            height: 500,
            width: 700,
            transparent: true,
        },
    });

    //Load html into window
    mainWindow.loadURL(url.format({
        pathname: path.join(__dirname, 'mainWindow.html'),
        protocol: 'file:',
        slashes: true
    }));

    mainWindow.on('closed', () => {
        mainWindow = null;
    })
});

app.on('window-all-closed', function() {

    if(process.platform !== 'darwin') {
        app.quit();
    }
});