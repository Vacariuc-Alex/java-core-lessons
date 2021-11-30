# java-core-lessons

###Git Local Configuration
* configure git account
* install git bash and configure
* configure git ssh
* configure git shortcuts
* configure git repository default branch
* Create a new remote repository: java-core-lessons without additional stuff
* Create a new java 8 project: java-core-lessons
* add gitignore and readme file

###Git Remote Configuration
1. git init
2. git add README.md
3. git commit -m "first commit"
4. git branch -M master
5. git remote add origin git@github.com:Vacariuc-Alex/java-core-lessons.git
6. git push -u origin master

###Useful Links
- Git bash installation: https://web.microsoftstream.com/video/9ca1dec5-e1f6-4f06-ae64-6616be274afd
- Git ssh: https://www.youtube.com/watch?v=WgZIv5HI44o
- Git shortcuts: https://www.youtube.com/watch?v=gpPnTodCMiU

###Git Shortcut List
```
[core]
    editor = vim
[pull]
    rebase = false
[fetch]
    prune = false
[rebase]
    autoStash = false
[user]
    name = Vacariuc-Alex
    email = alexandr.vacariuc@mastercard.com
[alias]
    co = checkout
    br = branch
    ci = commit
    st = status
    lg = log --graph --abbrev-commit --decorate --date=relative --format=format:'%C(bold blue)%h%C(reset) - %C(bold green)(%ar)%C(reset) %C(white)%s%C(reset) %C(dim white)- %an%C(reset)%C(bold yellow)%d%C(reset)'
```