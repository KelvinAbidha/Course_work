from django.shortcuts import render


def task_list(request):
    tasks=['Go to school','read book','Write code']

    return render(request, 'tasks/task_list.html',{'tasks':tasks})

# Create your views here.
