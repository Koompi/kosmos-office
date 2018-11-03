# KOSMOS OFFICE

KOSMOS Office is an opesource office application project mainly for KOSMOS. This project is written in Clojure.
### To use this project

To clone this repository

```
$ git clone https://github.com/Koompi/kosmos-office.git
```
You need to have ` Electron JS ` installed in your system.

```
$ sudo npm install -g npx
$ sudo npm install -g electron
$ sudo npm install -g electron-prebuilt
```

You need to have ` Shadow CLJS ` installed as well.

```
$ sudo npm install -g shadow-cljs
```
Change to project directory

```
$ cd kosmos-office
```
Now install the Node dependencies

```
$ npm install
```
To start the development renderer process

```
$ npm run dev
```
Open another terminal to run the Electron app in development mode

```
$ electron .
```
