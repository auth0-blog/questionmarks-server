```bash
curl http://localhost:8080/exams

curl -X POST -H "Content-Type: application/json" -d '{
    "title": "First exam"
}' http://localhost:8080/exams

curl -X POST -H "Content-Type: application/json" -d '{
    "title": "Another show exam",
    "description": "Another show exam desc"
}' http://localhost:8080/exams

curl -X POST -H "Content-Type: application/json" -d '{
    "title": "First exam",
    "description": "Just a test",
    "url": "trying-to-hack",
    "published": true
}' http://localhost:8080/exams

curl -X PUT -H "Content-Type: application/json" -d '{
    "title": "First exam",
    "description": "Just a test",
    "url": "trying-to-hack",
    "published": true
}' http://localhost:8080/exams

curl -X PUT -H "Content-Type: application/json" -d '{
    "id": 1,
    "title": "First exam",
    "description": "Just a test"
}' http://localhost:8080/exams

curl -X PUT -H "Content-Type: application/json" -d '{
    "id": 2,
    "title": "The third exam is amazing",
    "description": "Just a test"
}' http://localhost:8080/exams
```