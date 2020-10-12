# Git Edit Hunks

This is a demo project for learning how to interactively edit hunks with Git.  Sometimes the barrier is that we don't have minimal repros to practice on.  So here is one.

## How to use

To practice with this directory perform the following steps:

> Ensure you have `git` installed

- Clone this repo
  ```
  git@github.com:athomasoriginal/demo-youtube-channel-code.git
  ```
- Open `style.css` in your editor of choice
- Copy `new-style.css`
- Paste `new-style.css` into `style.css`
- Sanity check that the differences applied
  ```bash
  git status
  git diff
  ```
- Enter interactive edit mode - patch
  ```bash
  git add -p
  ```

From here you can attempt to interactively edit hunks to create custom patches.  Here are the ones we went through in our video:

- context, add, context
- context, delete & add, context
- context, delete & add, context
