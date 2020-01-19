# Quickstart

- Clone project

  ```bash
  git clone ...
  ```

- Move into `app`

  ```bash
  cd 05-chlorine-clojurescript-repl-app
  ```

- Start project

  ```bash
  npx shadow-cljs watch app
  ```

- Open the site

  ```bash
  open http://localhost:8280/
  ```

- Connect Chlorine to the Socket REPL

  ```bash
  Connect Clojure Socket REPL
  ```

  > Should auto detect and if it does not, this is an indication that you may not have opened the project correctly.

- Connect Chlorine to the Embedded REPL

  ```bash
  cljs.user=>
  ```

  > Again, you will see an error like `cannot connect` if you opened the project incorrectly

## Gotchas

I mentioned earlier that there is a chance that when connecting to a `shadow-cljs` REPL through Chlorine there is a chance that Atom might send you an error notification like

> Cannot find shadlow-cljs.edn

If you see the above, try to re-open the `app` as the root project in Atom.  This means that if `app` is nested in another file, don't tell Atom to open its parent folder, but the actual `app` dir.

## Notes

Note that in the current version of shadow-cljs you will not see a socket repl connect identified.  If you want to see the REPL connection it's available in `.shadow-cljs`.  Key to this is that atom expects the `shadow-cljs.edn` file to be at the root of the top level project.  e.g. `app/shadow-cljs.edn`.  If this is not the case, you will see this.
