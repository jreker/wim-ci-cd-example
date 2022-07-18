[![Deploy on Push](https://github.com/jreker/wim-ci-cd-example/actions/workflows/pipeline.yml/badge.svg)](https://github.com/jreker/wim-ci-cd-example/actions/workflows/pipeline.yml)
[![Deploy on PR](https://github.com/jreker/wim-ci-cd-example/actions/workflows/pr-pipeline.yml/badge.svg)](https://github.com/jreker/wim-ci-cd-example/actions/workflows/pr-pipeline.yml)
[![Jacoco Coverage](.github/badges/jacoco.svg)](.github/badges/jacoco.svg)

# WIM CI/CD Example Project

This pipeline consists out of a Spring Boot Java Projekt in folder "wim-calculator-backend".


## Deployment with Github Actions

https://docs.github.com/en/actions/deployment/about-deployments/deploying-with-github-actions


## Deploy to Heroku
### Step 1
Install Heroku CLI
```javascript
npm install -g heroku
```
### Step 2
Login to Heroku
```javascript
heroku login
```

### Step 3
Create Heroku app via CLI
```javascript
heroku create backend-api
```

### Step 4 - Deploy to Heroku?
```javascript
heroku deploy:jar target/calculator.jar --app wim-backend
```

### Set API Key for Deployment
```
set HEROKU_API_KEY="<<<API KEY>>>"
```

### Show Logs of Heroku
```
heroku logs --tail --app wim-backend
```

### Set Remote Repo to heroku:
```
heroku git:remote -a wim-java-backend
```

## Sources


**Create custom action:**
https://docs.github.com/en/actions/creating-actions/creating-a-docker-container-action#commit-tag-and-push-your-action-to-github

**Example** https://github.com/open-sauced/hot/tree/main/.github/workflows
