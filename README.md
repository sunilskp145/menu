# menu
Backend for online menu system


## api details

1. GET `/api/menu/items`
```
http://localhost:7000/api/menu/items/
[
    {
        "id": 1,
        "name": "Burger",
        "price": 599,
        "description": "Tasty",
        "image": ""
    },
    {
        "id": 2,
        "name": "Pizza",
        "price": 299,
        "description": "Cheesy",
        "image": ""
    },
    {
        "id": 3,
        "name": "Tea",
        "price": 199,
        "description": "Informative",
        "image": ""
    }
]

```
2. GET `/api/menu/items/{id}`
```
http://localhost:7000/api/menu/items/2
{
    "id": 2,
    "name": "Pizza",
    "price": 299,
    "description": "Cheesy",
    "image": ""
}

```
4. POST `/api/menu/items`
```
http://localhost:7000/api/menu/items/
Body(JSON) - 
{
    "name": "Paneer Pizza",
    "price":399,
    "description": "Cheesy",
    "image": ""
}


```
5. PUT `/api/menu/items/{id}`
```
http://localhost:7000/api/menu/items/2
{
    "name": "Plain Pizza",
    "price":199,
    "description": "",
    "image": ""
}

```
6. DELETE `/api/menu/items/{id}`
```
http://localhost:7000/api/menu/items/1
```


